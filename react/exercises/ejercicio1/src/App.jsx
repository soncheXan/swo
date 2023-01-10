import React from 'react';
import Container from './components/Container';
import Nav from './components/Nav';

function containers(number){
  const conts = new Array(number).fill(null)

  return conts.map((_, index) => <div className='col-3'><Container key={index} /></div>);
 
}

function App() {

  return (
    <>
      <Nav/>
      <div className='container mt-5'>
        <div className='row'>
          {containers(4)}
        </div>
        <div className='row mt-5'>
          {containers(4)}
        </div>
      </div>
    </>
  )
}

export default App