import NotificationIcon from '../../assets/img/notification-icon.svg'
import './style.css'

export function NotificationButton() {
  return (
    <div className="dsmeta-red-btn">
      <img src={NotificationIcon} alt="Notification" />
    </div>
  )
}
