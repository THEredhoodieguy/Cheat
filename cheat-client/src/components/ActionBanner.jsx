import React from 'react';

//a banner that displays the current state of the game
class ActionBanner extends React.Component {
    render = () => {
        return (
            <div className="actionBanner">
                <div className="actionBannerContent">
                    {/* Pile size */}
                    <div className="pileInfo">There are {this.props.pileSize} cards in the pile</div>
                    {/* 
                    * Current player and their action 
                    * 
                    * actionState: {currentPlayer: String, isDeciding: Boolean, numPlayed: Int, cardPlayed: String/cardEnum}
                    */}
                    <div className="currentAction">It's {this.props.actionState.currentPlayer}'s turn. </div>
                </div>
            </div>
        );
    };
}

export default ActionBanner;