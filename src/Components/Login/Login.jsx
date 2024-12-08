import { FaUser, FaLock } from "react-icons/fa";
import { useState } from "react";

import "./Login.css";
const Login = () => {
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");

  /*função para enviar o formulario usando Hooks */
  const handleSubmit = (event) => {
    event.preventDefault();

    //console log para mostrar os dados do usuario
    console.log("Dados de Login:", { userName, password });
  };
  return (
    <div className="container">
      <form onSubmit={handleSubmit}>
        <h1>Acesse o sistema da CooperFilme</h1>
        <div className="input-field">
          <input
            type="text"
            placeholder="E-mail"
            required
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
          />
          <FaUser className="icon" />
        </div>
        <div className="input-field">
          <input
            type="password"
            placeholder="Senha"
            required
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <FaLock className="icon" />
        </div>
        <div className="recall-forgert">
          <label>
            <input type="checkbox" />
            Lembre de mim
          </label>
          <a href="#"> Esqueceu a senha? , clique aqui para mudar a senha </a>
        </div>

        <button>Entrar</button>

        <div className="signup-link">
          <p>
            Não tem uma conta para enviar o seus roteiro? , cria uma conta em
            nosso site agora!!<a href="#">Registrar</a>
          </p>
        </div>
      </form>
    </div>
  );
};

export default Login;
