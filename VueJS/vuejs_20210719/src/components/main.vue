<template>
    <main>
        <div class="content bg-dark text-white">
            <div class="container" id="menu">
                <h1 style="margin-bottom:64px; font-size: 64px;">THE MENU</h1>
                <div class="border bg-light">
                    <div class="d-flex bg-dark">
                        <router-link to="/" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isPizza }">pizza</router-link>
                        <router-link to="/salads" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isSalads }">salads</router-link>
                        <router-link to="/starter" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isStarter }">starter</router-link>
                    </div>
                    <div>
                        <router-view></router-view>
                    </div>
                </div>
            </div>
        </div>
        <div class="content text-left text-white" style="background-color: #f44336!important; filter: grayscale(75%);">
            <div class="container w3-padding-64 w3-red w3-grayscale w3-xlarge" id="about">
                <div class="w3-content">
                    <h1 class="text-center" style="margin-bottom:64px; font-size: 64px;">About</h1>
                    <p>The Pizza Restaurant was founded in blabla by Mr. Italiano in lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <p><strong>The Chef?</strong> Mr. Italiano himself<img src="../assets/chef.jpg" style="width:150px" class="float-right rounded-circle" alt="Chef"></p>
                    <p>We are proud of our interiors.</p>
                    <img src="../assets/onepage_restaurant.jpg" style="width:100%" class="my-3" alt="Restaurant">
                    <h1 class="my-2"><b>Opening Hours</b></h1>
                    
                    <div class="row">
                        <div class="col-6">
                            <p class="my-4">Mon &amp; Tue CLOSED</p>
                            <p class="my-4">Wednesday 10.00 - 24.00</p>
                            <p class="my-4">Thursday 10:00 - 24:00</p>
                        </div>
                        <div class="col-6">
                            <p class="my-4">Friday 10:00 - 12:00</p>
                            <p class="my-4">Saturday 10:00 - 23:00</p>
                            <p class="my-4">Sunday Closed</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="content p-0">
            <img src="../assets/map.jpg" class="w3-image w3-greyscale" style="width:100%;" id="myMap">
        </div>
        <div class="content text-left text-white" style="background-color: #607d8b!important">
            <div class="container" id="contact">
                <h1 class="text-center" style="margin-bottom:64px; font-size: 64px;">Contact</h1>
                <p class="mb-2">Find us at some address at some place or call us at 05050515-122330</p>
                <p class="mb-2"><span class="bg-dark px-2 py-1">FYI!</span> We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste.</p>
                <p class="reserve my-4"><strong>Reserve</strong> a table, ask for today's special or just send us a message:</p>
                <form action="/action_page.php" target="_blank">
                    <p><input class="form-control py-3" type="text" placeholder="Name" required="" name="Name"></p>
                    <p><input class="form-control py-3" type="number" placeholder="How many people" required="" name="People"></p>
                    <p><input class="form-control py-3" type="datetime-local" placeholder="Date and time" required="" name="date" value="2020-11-16T20:00"></p>
                    <p><input class="form-control py-3" type="text" placeholder="Message \ Special requirements" required="" name="Message"></p>
                    <p><button type="submit" class="btn btn-block btn-secondary">SEND MESSAGE</button></p>
                </form>
            </div>
        </div>
    </main>
</template>

<script>
export default {
    data() {
        return {
            isPizza: true,
            isSalads: false,
            isStarter: false
        }
    },
    updated() {
        if (this.$route.name == "pizza") {
            this.isPizza = true;
            this.isSalads = false;
            this.isStarter = false;
        }
        else if (this.$route.name == "salads") {
            this.isPizza = false;
            this.isSalads = true;
            this.isStarter = false;
        }
        else {
            this.isPizza = false;
            this.isSalads = false;
            this.isStarter = true;
        }
    }

}
</script>

<style>
    main {
        font-family: "Amatic SC", sans-serif;
        font-size: 1.5rem;
    }

    .reserve {
        font-size: 2rem;
    }

    .content {
        padding-top: 64px;
        padding-bottom: 64px;
    }

    .content form button {
        font-size: 1.5rem;
        
    }

    .content form input {
        font-size: 1.5rem;
    }

    /* .router-link:hover {
        background-color: #f44336!important;
    } */

</style>