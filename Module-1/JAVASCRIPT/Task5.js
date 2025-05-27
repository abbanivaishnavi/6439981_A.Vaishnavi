// Event class definition
class Event {
  constructor(name, date, seats) {
    this.name = name;
    this.date = new Date(date);
    this.seats = seats;
    this.registrations = 0;
  }

  // Method to check if seats are available
  checkAvailability() {
    return this.registrations < this.seats;
  }

  // Method to register a user if available
  registerUser() {
    if (this.checkAvailability()) {
      this.registrations++;
      console.log(`Registered successfully for ${this.name}. Seats left: ${this.seats - this.registrations}`);
    } else {
      console.log(`No seats available for ${this.name}`);
    }
  }
}

// Create event instances
const event1 = new Event("Community Picnic", "2025-06-20", 30);
const event2 = new Event("Book Fair", "2025-07-10", 15);

// Check availability and register users
console.log(event1.checkAvailability()); // true
event1.registerUser(); // Registered successfully

// List keys and values using Object.entries()
console.log("Event1 properties and values:");
for (const [key, value] of Object.entries(event1)) {
  console.log(`${key}: ${value}`);
}
