# ============================================================
# Attributes – wajib untuk Gson, Retrofit, Hilt & stack trace
# ============================================================
-keepattributes *Annotation*, Signature, Exceptions, InnerClasses, EnclosingMethod
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# ============================================================
# Gson – pertahankan field yang pakai @SerializedName agar
# deserialisasi JSON tidak rusak setelah obfuscation
# ============================================================
-keepclassmembers,allowobfuscation class * {
    @com.google.gson.annotations.SerializedName <fields>;
}
-keep,allowobfuscation class com.fauzan.myanime.data.remote.dto.** { *; }

# ============================================================
# Retrofit
# ============================================================
-keep,allowobfuscation,allowshrinking interface retrofit2.Call
-keep,allowobfuscation,allowshrinking class retrofit2.Response
# Diperlukan agar suspend function Retrofit bisa resolve Continuation
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.Continuation

# ============================================================
# OkHttp
# ============================================================
-dontwarn okhttp3.**
-dontwarn okio.**
-keep class okhttp3.internal.publicsuffix.PublicSuffixDatabase { *; }

# ============================================================
# Room – entity & DAO harus utuh agar refleksi Room tidak gagal
# ============================================================
-keep @androidx.room.Entity class * { *; }
-keep @androidx.room.Dao interface * { *; }
-keep class * extends androidx.room.RoomDatabase { *; }

# ============================================================
# Kotlin Parcelize – CREATOR field dibutuhkan saat un-parceling
# ============================================================
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# ============================================================
# Kotlin stdlib – dynamic feature modules load classes by original
# name via their own classloader, so stdlib must not be renamed
# ============================================================
-keep class kotlin.** { *; }

# ============================================================
# Kotlin Coroutines
# ============================================================
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# ============================================================
# Arrow Core (Either, sealed class Failure, dsb.)
# ============================================================
-keep class arrow.core.** { *; }

# ============================================================
# Hilt / Dagger – sebagian besar rules sudah dibundle oleh Hilt,
# ini hanya untuk @HiltViewModel yang pakai refleksi runtime
# ============================================================
-keepnames @dagger.hilt.android.lifecycle.HiltViewModel class * extends androidx.lifecycle.ViewModel

# ============================================================
# SQLCipher – JNI bridge dan native bindings wajib utuh
# ============================================================
-keep class net.sqlcipher.** { *; }
-keep class net.sqlcipher.database.** { *; }
-dontwarn net.sqlcipher.**
