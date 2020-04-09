import React from 'react';
import './App.css';
import Card from './components/Card';

function App() {
  return (
    <div className="app">
      <Card suit="hearts" value="ace"/>
    </div>
  );
}

export default App;
