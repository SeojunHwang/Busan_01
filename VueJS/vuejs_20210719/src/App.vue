<template>
  <div id="app">
    <ui-header></ui-header>
    <ui-main></ui-main>
    <ui-footer></ui-footer>
  </div>
</template>

<script>
import footerVue from './components/footer.vue'
import headerVue from './components/header.vue'
import mainVue from './components/main.vue'

export default {
  name: 'app',
  components: {
    "ui-header" : headerVue,
    "ui-main" : mainVue,
    "ui-footer" : footerVue
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
  /* margin-top: 60px; */
}

</style>
