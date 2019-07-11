import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";

import Home from "./Home";

const App = () => {
  return (
    <BrowserRouter basename="/">
      <Route path="/" component={Home} />
    </BrowserRouter>
  );
};

export default App;
