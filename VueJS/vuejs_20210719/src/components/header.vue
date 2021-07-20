<template>
    <header class="container-fulid">
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#home">HOME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#menu">MENU</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#about">ABOUT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#contact">CONTACT</a>
                </li>
            </ul>
        </nav>

        <div class="position-relative bgHeader" id="home">
            <div class="position-absolute px-3 py-2 leftBottom">
                <span class="text-center bg-dark px-2 text-white d-inline-block">Open from 10am to 12pm</span>
            </div>
            <div class="position-absolute headerTitle ">
                <span class="text-white text-center" style="font-size:100px">thin<br>CRUST PIZZA</span>
                <p><a href="#menu" class="text-white text-center text-decoration-none bg-dark p-3">Let me see the menu</a></p>
            </div>
        </div>
    </header>
</template>

<script>
export default {
    
}
</script>

<style>

    header {
        font-family: "Amatic SC", sans-serif;
    }

    .navbar {
        opacity: 0.7;
    }

    .navbar a {
        font-size: 1.5rem;
    }

    .navbar:hover {
        opacity: 1.0;
    }

    .bgHeader {
        background-image: url("../assets/pizza.jpg");
        background-repeat: no-repeat;
        background-position: center;
        background-size: cover;
        min-height: 90vh;
    }

    .leftBottom {
        left: 0;
        bottom: 0;
    }

    .leftBottom span {
        font-size: 1.5rem;
    }

    .headerTitle {
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
    }

    .headerTitle a {
        font-size: 2rem;
    }

</style>