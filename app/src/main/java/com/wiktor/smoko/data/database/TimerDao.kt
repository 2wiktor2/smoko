package com.wiktor.smoko.data.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TimerDao {

    @Query("SELECT * FROM MyTimers")
    fun getAllTamers(): LiveData<List<MyTimerDbModel>>

    @Query("SELECT * FROM MyTimers WHERE id == :timerId")
    fun getTimerById(timerId: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addTimer(myTimer: MyTimerDbModel)

    @Update
    fun editTimer(myTimer: MyTimerDbModel)

    @Delete
    fun deleteTimer(myTimer: MyTimerDbModel)

    @Query("DELETE FROM MyTimers")
    fun deleteAllTimers()


/*    @Query("SELECT * FROM movies")
    fun getAllMovies(): LiveData<List<Movie?>?>?

    @Query("SELECT * FROM favouriteMovies")
    fun getAllFavouriteMovies(): LiveData<List<FavouriteMovie?>?>?

    @Query("SELECT * FROM movies WHERE id == :movieId")
    fun getMovieById(movieId: Int): Movie?

    @Query("SELECT * FROM favouriteMovies WHERE id == :movieId")
    fun getFavouriteMovieById(movieId: Int): FavouriteMovie?

    @Query("DELETE FROM movies")
    fun deleteAllMovies()

    @Insert
    fun insertMovie(movie: Movie?)

    @Delete
    fun deleteMovie(movie: Movie?)

    @Insert
    fun insertFavouriteMovie(movie: FavouriteMovie?)

    @Delete
    fun deleteFavouriteMovie(movie: FavouriteMovie?)*/
/*    //выводит список валют в recyclerView
    @Query("SELECT * FROM full_price_list ORDER BY lastUpdate DESC")
    fun getPriceList(): LiveData<List<CoinInfoDto>>

    //Детальная информация для отдельного экрана
    @Query("SELECT * FROM full_price_list WHERE fromSymbol == :fSym LIMIT 1")
    fun getPriceInfoAboutCoin(fSym: String): LiveData<CoinInfoDto>

    //Сохранение, полученных из итернета, данных в базу
    // onConflict = OnConflictStrategy.REPLACE - заменять данные при получении новых данных
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinInfoDto>)*/

}