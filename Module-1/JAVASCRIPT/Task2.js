// Using const for event name and date (immutable)
const eventName = "Community Cleanup Day";
const eventDate = "2025-06-15";

// Using let for available seats (mutable)
let availableSeats = 50;

// Function to register a seat (decrement availableSeats)
function registerSeat() {
    if (availableSeats > 0) {
        availableSeats--; // decrement seats by 1
        console.log(`Registered successfully! Seats left: ${availableSeats}`);
    } else {
        console.log("Sorry, no seats available.");
    }
}

// Concatenate event details with template literals
const eventInfo = `Event: ${eventName} | Date: ${eventDate} | Seats Available: ${availableSeats}`;
console.log(eventInfo);

// Simulate registrations
registerSeat(); // availableSeats becomes 49
registerSeat(); // availableSeats becomes 48
