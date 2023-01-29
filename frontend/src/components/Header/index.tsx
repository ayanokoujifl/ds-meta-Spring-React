import './style.css'
import Logo from '../../assets/img/logo.svg'

export function Header() {
  return (
    <>
      <header>
        <div className="dsmeta-logo-container">
          <img src={Logo} alt="DSMeta" />
          <h1>DSMeta</h1>
          <p>
            Desenvolvido por
            <a
              href="https://www.instagram.com/luis_gustavo_dev"
              target="_blank"
            >
              @luis_gustavo_dev
            </a>
          </p>
        </div>
      </header>
    </>
  )
}
