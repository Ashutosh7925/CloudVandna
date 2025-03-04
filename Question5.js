document.addEventListener("DOMContentLoaded", function () {
    const images = [
        "image1.jpg",
        "image2.jpg",
        "image3.jpg",
        "image4.jpg"
    ];
    
    let currentIndex = 0;
    const imageElement = document.getElementById("sliderImage");
    const prevBtn = document.getElementById("prevBtn");
    const nextBtn = document.getElementById("nextBtn");
    
    function updateImage() {
        imageElement.src = images[currentIndex];
    }
    
    prevBtn.addEventListener("click", function () {
        currentIndex = (currentIndex - 1 + images.length) % images.length;
        updateImage();
    });
    
    nextBtn.addEventListener("click", function () {
        currentIndex = (currentIndex + 1) % images.length;
        updateImage();
    });
    
    updateImage();
});
