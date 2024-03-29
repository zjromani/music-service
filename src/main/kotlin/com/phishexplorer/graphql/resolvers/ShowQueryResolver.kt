import com.phishexplorer.musicservice.models.Show
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ShowQueryResolver {
    fun show(id: String): Show {
        return Show(
            id = id,
            date = LocalDate.of(1992, 12, 14),
            location = "Binghamton, NY",
            venue = "Broome County Arena",
            setlist = listOf(
                "Punch You in the Eye",
                "The Sloth",
                "Reba",
                "The Squirming Coil",
                "Maze",
                "Colonel Forbin's Ascent",
                "Fly Famous Mockingbird",
                "Shine",
                "Chalk Dust Torture",
                "Audience Chess Move",
                "David Bowie",
                "Acoustic Army",
                "The Lizards",
                "A Day in the Life"
            )
        )
    }
}

