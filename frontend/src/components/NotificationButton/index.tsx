import axios from 'axios'
import { toast } from 'react-toastify'
import { Toast } from 'react-toastify/dist/components'
import NotificationIcon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request'
import './style.css'

type Props = {
  saleId: number
}

function handleClick(saleId: number) {
  axios(`${BASE_URL}/sales/${saleId}/notification`).then(() =>
    toast.info('SMS enviado com sucesso!')
  )
}

export function NotificationButton({ saleId }: Props) {
  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={NotificationIcon} alt="Notification" />
    </div>
  )
}
