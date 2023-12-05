package com.example.kotlinseminar.controller

import com.example.kotlinseminar.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@ApiController
class MemberController(
    private val memberService: MemberService,
) {
    @GetMapping("/members")
    fun getMembers(): ResponseEntity<List<MemberService.MemberResponse>> {
        return ResponseEntity.ok(memberService.getMembers())
    }

    @PostMapping("/members")
    fun createMember(
        @RequestBody request: MemberCreateRequest,
    ): ResponseEntity<Unit> {
        memberService.create(request)
        return ResponseEntity.ok().build()
    }

    data class MemberCreateRequest(
        val name: String,
        val nickname: String,
        val age: Int,
    )

    @GetMapping("/members/{memberId}")
    fun getMemberById(
        @PathVariable memberId: Long,
    ): ResponseEntity<MemberService.MemberResponse> {
        return ResponseEntity.ok(memberService.getById(memberId))
    }

    @PatchMapping("/members/{memberId}")
    fun updateMemberAge(
        @RequestBody request: MemberUpdateRequest,
        @PathVariable memberId: Long,
    ): ResponseEntity<Unit> {
        memberService.update(request, memberId)
        return ResponseEntity.ok().build()
    }

    data class MemberUpdateRequest(
        val age: Int,
    )

    @DeleteMapping("/members/{memberId}")
    fun deleteMemberById(
        @PathVariable memberId: Long,
    ): ResponseEntity<Unit> {
        memberService.deleteById(memberId)
        return ResponseEntity.ok().build()
    }
}
