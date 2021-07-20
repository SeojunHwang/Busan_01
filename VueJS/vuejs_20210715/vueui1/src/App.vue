<template>
  <div id="app">
    <ui-header></ui-header>
    <ui-main></ui-main>
    <ui-footer></ui-footer>
  </div>
</template>

<script>
import uiHeader from "./components/uiheader.vue"
import uiMain from "./components/uimain.vue"
import uiFooter from "./components/uifooter.vue"

export default {
  name: 'app',
  components: {
    "ui-header": uiHeader,
    "ui-main": uiMain,
    "ui-footer": uiFooter
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 55px;
}

</style>
