// jQuery code
$(document).ready(function () {
  // Handle click event on register button
  $('#registerBtn').click(function () {
    console.log("Register button clicked");
    
    // Show event cards with fadeIn effect
    $('.eventCard').fadeIn(500);

    // Example: Hide event cards after 3 seconds with fadeOut
    setTimeout(() => {
      $('.eventCard').fadeOut(500);
    }, 3000);
  });
});
