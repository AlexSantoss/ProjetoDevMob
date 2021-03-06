package devmob.semanasacademicas

import android.os.Parcelable
import com.google.firebase.Timestamp
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Atividade (
    var id: String = "",
    var nome: String = "",
    var grupo: String = "",
    var tipo: String = "outros",
    var inicio: Timestamp = Timestamp.now(),
    var fim: Timestamp = Timestamp.now(),
    var apresentador: String = "Apresentador não informado",
    var local: String = "Local não informado",
    var link: String = "https://fb.com/SemanaDaComputacaoUFRJ"
): Parcelable
