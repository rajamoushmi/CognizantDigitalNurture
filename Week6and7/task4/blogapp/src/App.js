// src/App.js
import React from 'react';
import './App.css'; // Keep default styles or add your own
import Posts from './Posts'; // Import the Posts component

function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* You can remove or modify default React app content here */}
        <Posts /> {/* Render the Posts component */}
      </header>
    </div>
  );
}

export default App;