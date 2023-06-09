package ir.sina.moviemaktab.data.remote

import ir.sina.moviemaktab.model.dto.MovieDto
import ir.sina.moviemaktab.model.dto.MoviesResponseDto
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movie/popular")
    suspend fun getAllMovies(@Query("page") page: Int): Response<MoviesResponseDto>
}