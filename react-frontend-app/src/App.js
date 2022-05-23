import './App.css';
import AppContact from './AppContact';
import AppFooter from './AppFooter';
import AppNavbar from './AppNavbar';
import AppForm from './AppForm';
import AppCard from './AppCard';
import { BrowserRouter, Routes, Route } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <div>
      
      
      <BrowserRouter>
      <Routes>
        <Route path="/" element={<AppNavbar />}>
          <Route path="gifts" element={<AppCard />} />
          <Route path="addGift" element={<AppForm />} />
          <Route path="contact" element={<AppContact />} />

        </Route>
      </Routes>
    </BrowserRouter>
      

      <AppFooter />
      
      
    </div>

  );
}

export default App;
