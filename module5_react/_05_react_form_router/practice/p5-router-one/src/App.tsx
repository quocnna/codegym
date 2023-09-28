import React from 'react';
import {Link, Route, Routes} from "react-router-dom";
import Home from "./component/Home";
import About from "./component/About";
import Contact from "./component/Contract";

function App() {
  return (
      <div>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/about">About</Link>
          </li>
          <li>
            <Link to="/contact">Contact</Link>
          </li>
        </ul>
          <hr />
          <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
          </Routes>
      </div>
  );
}

export default App;
