	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 10, 14	sdk_version 10, 14
	.globl	_Push                   ## -- Begin function Push
	.p2align	4, 0x90
_Push:                                  ## @Push
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$32, %rsp
	movl	$16, %eax
	movl	%eax, %ecx
	movq	%rdi, -8(%rbp)
	movl	%esi, -12(%rbp)
	movq	%rcx, %rdi
	callq	_malloc
	movq	%rax, -24(%rbp)
	movl	-12(%rbp), %esi
	movq	-24(%rbp), %rax
	movl	%esi, (%rax)
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	-24(%rbp), %rcx
	movq	%rax, 8(%rcx)
	movq	-24(%rbp), %rax
	movq	-8(%rbp), %rcx
	movq	%rax, (%rcx)
	addq	$32, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.globl	_deleteN                ## -- Begin function deleteN
	.p2align	4, 0x90
_deleteN:                               ## @deleteN
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$48, %rsp
	movq	%rdi, -8(%rbp)
	movl	%esi, -12(%rbp)
	movq	-8(%rbp), %rdi
	movq	(%rdi), %rdi
	movq	%rdi, -24(%rbp)
	movq	-8(%rbp), %rdi
	movq	(%rdi), %rdi
	movq	%rdi, -32(%rbp)
	movl	$0, -36(%rbp)
LBB1_1:                                 ## =>This Inner Loop Header: Depth=1
	movl	-36(%rbp), %eax
	cmpl	-12(%rbp), %eax
	jge	LBB1_14
## %bb.2:                               ##   in Loop: Header=BB1_1 Depth=1
	cmpl	$0, -36(%rbp)
	jne	LBB1_5
## %bb.3:                               ##   in Loop: Header=BB1_1 Depth=1
	cmpl	$1, -12(%rbp)
	jne	LBB1_5
## %bb.4:                               ##   in Loop: Header=BB1_1 Depth=1
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	movq	8(%rax), %rax
	movq	-8(%rbp), %rcx
	movq	%rax, (%rcx)
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	callq	_free
	jmp	LBB1_12
LBB1_5:                                 ##   in Loop: Header=BB1_1 Depth=1
	movl	-36(%rbp), %eax
	movl	-12(%rbp), %ecx
	subl	$1, %ecx
	cmpl	%ecx, %eax
	jne	LBB1_8
## %bb.6:                               ##   in Loop: Header=BB1_1 Depth=1
	cmpq	$0, -24(%rbp)
	je	LBB1_8
## %bb.7:                               ##   in Loop: Header=BB1_1 Depth=1
	movq	-24(%rbp), %rax
	movq	8(%rax), %rax
	movq	-32(%rbp), %rcx
	movq	%rax, 8(%rcx)
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	callq	_free
	jmp	LBB1_11
LBB1_8:                                 ##   in Loop: Header=BB1_1 Depth=1
	movq	-24(%rbp), %rax
	movq	%rax, -32(%rbp)
	cmpq	$0, -32(%rbp)
	jne	LBB1_10
## %bb.9:
	jmp	LBB1_14
LBB1_10:                                ##   in Loop: Header=BB1_1 Depth=1
	movq	-24(%rbp), %rax
	movq	8(%rax), %rax
	movq	%rax, -24(%rbp)
LBB1_11:                                ##   in Loop: Header=BB1_1 Depth=1
	jmp	LBB1_12
LBB1_12:                                ##   in Loop: Header=BB1_1 Depth=1
	jmp	LBB1_13
LBB1_13:                                ##   in Loop: Header=BB1_1 Depth=1
	movl	-36(%rbp), %eax
	addl	$1, %eax
	movl	%eax, -36(%rbp)
	jmp	LBB1_1
LBB1_14:
	addq	$48, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.globl	_printList              ## -- Begin function printList
	.p2align	4, 0x90
_printList:                             ## @printList
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
LBB2_1:                                 ## =>This Inner Loop Header: Depth=1
	cmpq	$0, -8(%rbp)
	je	LBB2_3
## %bb.2:                               ##   in Loop: Header=BB2_1 Depth=1
	movq	-8(%rbp), %rax
	movl	(%rax), %esi
	movq	-8(%rbp), %rdx
	movq	-8(%rbp), %rax
	movq	8(%rax), %rcx
	leaq	L_.str(%rip), %rdi
	movb	$0, %al
	callq	_printf
	movq	-8(%rbp), %rcx
	movq	8(%rcx), %rcx
	movq	%rcx, -8(%rbp)
	movl	%eax, -12(%rbp)         ## 4-byte Spill
	jmp	LBB2_1
LBB2_3:
	leaq	L_.str.1(%rip), %rdi
	movb	$0, %al
	callq	_printf
	movl	%eax, -16(%rbp)         ## 4-byte Spill
	addq	$16, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.globl	_main                   ## -- Begin function main
	.p2align	4, 0x90
_main:                                  ## @main
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$16, %rsp
	movl	$16, %eax
	movl	%eax, %edi
	movl	$0, -4(%rbp)
	callq	_malloc
	movq	%rax, -16(%rbp)
	movq	-16(%rbp), %rax
	movq	$0, 8(%rax)
	leaq	-16(%rbp), %rdi
	movl	$1, %esi
	callq	_Push
	leaq	-16(%rbp), %rdi
	movl	$2, %esi
	callq	_Push
	leaq	-16(%rbp), %rdi
	movl	$3, %esi
	callq	_Push
	movq	-16(%rbp), %rdi
	callq	_printList
	leaq	-16(%rbp), %rdi
	movl	$1, %esi
	callq	_deleteN
	movq	-16(%rbp), %rdi
	callq	_printList
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"[%i] [%p]->%p\n"

L_.str.1:                               ## @.str.1
	.asciz	"\n\n"


.subsections_via_symbols
