<template>
    <main class="container">
        <div class="row py-5">
            <div class="col-sm-6 px-4 py-3">
                <img src="../assets/tablesetting2.jpg" alt="" class="w-100">
            </div>
            <div class="col-sm-6 px-4 py-3">
                <h1 class="text-center mt-2">About Catering</h1><br>
                <h5 class="text-center mt-2">Tradition since 1889</h5>
                <p class="text-left mt-3">The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet, consectetur adipiscing elit consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute iruredolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.We only use <span class="">seasonal</span> ingredients.</p>
                <p class="text-left mt-3 text-secondary">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod temporincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>
        </div>

        <hr>

        <div class="row py-5">
            <div class="col-sm-6 px-4 py-3 text-left">
                <h1 class="text-center my-2">Our Menu</h1><br>
                <h4 class="my-2">Bread Basket</h4>
                <p class="text-secondary my-3">Assortment of fresh baked fruit breads and muffins 5.50</p><br>
                
                <h4 class="my-2">Honey Almond Granola with Fruits</h4>
                <p class="text-secondary my-3">Natural cereal of honey toasted oats, raisins, almonds and dates 7.00</p><br>
                
                <h4 class="my-2">Belgian Waffle</h4>
                <p class="text-secondary my-3">Vanilla flavored batter with malted flour 7.50</p><br>
                
                <h4 class="my-2">Scrambled eggs</h4>
                <p class="text-secondary my-3">Scrambled eggs, roasted red pepper and garlic, with green onions 7.50</p><br>
                
                <h4 class="my-2">Blueberry Pancakes</h4>
                <p class="text-secondary my-3">With syrup, butter and lots of berries 8.50</p>
            </div>
            <div class="col-sm-6">
                <img src="../assets/tablesetting.jpg" alt="" class="w-100">
            </div>
        </div>

        <hr>

        <div class="row">
            <div class="col-sm-12 text-left">
                <h1 class="my-2">Contact</h1><br>
                <p class="my-3">We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste. Do not hesitate to contact us.</p>
                <p class="text-info my-3"><b>Catering Service, 42nd Living St, 43043 New York, NY</b></p>
                <p class="my-3">You can also contact us by phone 00553123-2323 or email catering@catering.com, or you can send us a message here:</p>
                <form action="/action_page.php" target="_blank">
                <p class="my-3"><input class="form-control-plaintext py-3 border border-top-0 border-right-0 border-left-0" type="text" placeholder="Name" required="" name="Name"></p>
                <p class="my-3"><input class="form-control-plaintext py-3 border border-top-0 border-right-0 border-left-0" type="number" placeholder="How many people" required="" name="People"></p>
                <p class="my-3"><input class="form-control-plaintext py-3 border border-top-0 border-right-0 border-left-0" type="datetime-local" placeholder="Date and time" required="" name="date" value="2021-07-15T11:00"></p>
                <p class="my-3"><input class="form-control-plaintext py-3 border border-top-0 border-right-0 border-left-0" type="text" placeholder="Message \ Special requirements" required="" name="Message"></p>
                <p class="my-3"><button class="btn btn-secondary" type="submit">SEND MESSAGE</button></p>
                </form>
            </div>
        </div>
    </main>
</template>

<script>
export default {
    
}
</script>

<style>

</style>