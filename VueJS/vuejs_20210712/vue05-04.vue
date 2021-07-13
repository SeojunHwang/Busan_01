<template>
    <!-- html 태그 내용 입력 -->
    <div>
        <span>
            <button>{{ msg }}</button>
        </span>
    </div>
</template>

<script>
// 자바스크립트 내용 입력
// ES6의 모듈화 관련 문법
export default {
    data: {
        msg: "click 버튼"
    }
}
</script>

<style>
/* 해당 컴포넌트에서 사용할 CSS 내용 입력 */
    span {
        font-size: 1.2em;
    }
</style>