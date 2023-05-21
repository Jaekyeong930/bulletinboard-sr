import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {

  let [num, setNum] = useState(0);
  let [num2, setNum2] = useState(0)

  // setTimeout(() => { setNum(num = num +1 )}, 1000)
  // setTimeout(() => { setNum2(num2++)}, 1000)

  return (
    <div className="App">
      <header className="App-header">
        <div>{ num }</div>
        <button onClick={() => {setNum(num = num+1)}}>+연산자는 누르는 횟수만큼 증가</button>
        <div>{ num2 }</div>
        <button onClick={() => {setNum2(++num2)}}>++연산자는 두번 연속 눌러야 한번 증가</button>
      </header>
    </div>
  );
}

export default App;
