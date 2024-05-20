import axios from "axios";

export default axios.create({
  baseURL: "https://3347-240e-305-2580-1b7e-aca2-1a3-659a-88c7.ngrok-free.app/",
  headers: { "ngrok-skip-browser-warning": "true" },
});
