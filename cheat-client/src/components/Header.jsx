import React from 'react';

//Shows information about player's opponents
class Header extends React.Component {
    render = () => {
        return (
            <div className="header">
                {this.props.opponents?.map((value, index) => {
                    return <div key={index} className="opponent">{value.name}: {value.handSize}</div>
                })}
            </div>
        );
    };
}

export default Header;