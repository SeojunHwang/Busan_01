<template>
    <header>
        <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top shadow">
            <a class="navbar-brand" href="#">Gourmet au Catering</a>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Menu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
        </nav>

        <div class="headerImg mx-auto position-relative">
            <img src="../assets/hamburger.jpg" alt="" class="mw-100">
            <div class="headerImgTitleDiv position-absolute py-3 px-4">
                <h1 class="headerImgTitleH1">Le Catering</h1>
            </div>
        </div>
    </header>
</template>

<script>
export default {
    
}
</script>

<style>
    .headerImg {
        max-width: 1600px;
        min-width: 500px;
    }
    
    .headerImgTitleDiv {
        left: 0;
        bottom: 0;
    }

    .headerImgTitleH1 {
        font-size: 36px;
    }
</style>