import { Outlet } from "react-router-dom";
import React from "react";

// rafce
const Layout = () => {
  return (
    <main>
      <Outlet></Outlet>
    </main>
  );
};

export default Layout;
