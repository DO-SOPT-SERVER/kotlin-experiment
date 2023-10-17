package com.example.kotlinseminar.service

import com.example.kotlinseminar.controller.MemberController
import com.example.kotlinseminar.domain.entity.Member
import com.example.kotlinseminar.repository.MemberJpaRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.stream.Collectors


@Service
@Transactional(readOnly = true)
class MemberService(
        private val memberRepository: MemberJpaRepository
) {

    fun getMembers() : List<MemberResponse> {
        return memberRepository.findAll()
                .stream()
                .map { MemberResponse(it.id, it.name, it.nickname) }
                .collect(Collectors.toList())
    }

    data class MemberResponse(
            val id: Long?,
            val name: String,
            val nickname: String
    )

    fun getById(id: Long) : MemberResponse {
        val member: Member = memberRepository.findById(id).orElseThrow { throw RuntimeException("Not Found") }
        return MemberResponse(
                member.id!!,
                member.name,
                member.nickname
        )
    }


    @Transactional
    fun deleteById(id: Long) {
        memberRepository.deleteById(id)
    }

    @Transactional
    fun create(request: MemberController.MemberCreateRequest) {
        val member = Member(
                name = request.name,
                nickname = request.nickname,
                age = request.age
        )
        memberRepository.save(member)
    }

    @Transactional
    fun update(request: MemberController.MemberUpdateRequest, memberId: Long) : Unit {
        val member: Member = memberRepository.findById(memberId).orElseThrow { throw RuntimeException("Not Found") }
        member.age = request.age
    }

}