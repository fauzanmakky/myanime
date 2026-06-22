# ============================================================
# Attributes – wajib untuk Gson, Retrofit & stack trace
# ============================================================
-keepattributes *Annotation*, Signature, Exceptions, InnerClasses, EnclosingMethod
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# ============================================================
# Gson – pertahankan field @SerializedName agar JSON mapping utuh
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
# Kotlin Coroutines
# ============================================================
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# ============================================================
# Arrow Core
# ============================================================
-keep class arrow.core.** { *; }

# ============================================================
# SQLCipher – JNI bridge dan native bindings wajib utuh
# ============================================================
-keep class net.sqlcipher.** { *; }
-keep class net.sqlcipher.database.** { *; }
-dontwarn net.sqlcipher.**

# ============================================================
# Core Public API – wajib dipertahankan karena R8 memproses
# library secara isolated; app & feature modules mereferensikan
# class-class ini by original name via Hilt DI.
# ============================================================
-keep class com.fauzan.myanime.domain.** { *; }
-keep class com.fauzan.myanime.data.remote.** { *; }
-keep class com.fauzan.myanime.data.repository.** { *; }
-keep class com.fauzan.myanime.utils.** { *; }
-keep class com.fauzan.myanime.di.** { *; }
-keep class com.fauzan.myanime.security.** { *; }
