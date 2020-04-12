import React from 'react';
import Header from './components/Header';
import Hand from './components/Hand';
import ActionBanner from './components/ActionBanner';

import './App.css';

class App extends React.Component {

  render = () => {
    const opps = [{"name": "Steve", "handSize": 12}, {"name":"Dennis", "handSize":22}, {"name":"Dave", "handSize":8}];
    const hand = [{"suit":"♥️", "value":"ace"}, {"suit":"♠️", "value":"two"}, {"suit":"♦️", "value":"three"}, {"suit":"♣️", "value":"four"}];
    //actionState: {currentPlayer: String, isDeciding: Boolean, numPlayed: Int, cardPlayed: String/cardEnum}
    const currentState = {"currentPlayer": "Dennis", "isDeciding": true, "numPlayed": 0, "cardPlayed": "none"};

    return (
      <div className="app">
        <Header opponents={opps}/>
        <ActionBanner pileSize={25} actionState={currentState} />
        <Hand cards={hand} />
      </div>
    );
  };
}

export default App;
