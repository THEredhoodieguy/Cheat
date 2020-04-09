import React from 'react';
import './App.css';
import Card from './components/Card';
import Header from './components/Header';

class App extends React.Component {

  render = () => {
    const opps = [{"name": "Steve", "handSize": 12}, {"name":"Dennis", "handSize":22}, {"name":"Dave", "handSize":8}];

    return (
      <div className="app">
        <Header opponents={opps}/>
        <Card suit="hearts" value="ace"/>
      </div>
    );
  };
}

export default App;
