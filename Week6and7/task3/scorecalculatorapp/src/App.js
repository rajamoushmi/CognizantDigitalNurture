import React from 'react';
import CalculateScore from './Components/CalculateScore'; // Adjust path if necessary
import './StyleSheet/mystyle.css'; // Import the stylesheet

function App() {
  return (
    <div className="App">
      <h1>Student Management Portal</h1>
      <CalculateScore Name="Alice" School="High School A" Total={450} Goal={500} />
      <CalculateScore Name="Bob" School="High School B" Total={380} Goal={500} />
      {/* You can add more instances of CalculateScore with different props */}
    </div>
  );
}

export default App;