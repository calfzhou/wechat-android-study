package com.tencent.mm.booter.notification.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.setting.SettingsRingtoneUI;

public final class i
{
  private Context context = ak.getContext();
  private boolean djm = false;

  @SuppressLint({"HandlerLeak"})
  private cm djn = new j(this, Looper.getMainLooper());
  private MediaPlayer tA = null;

  public static String w(Context paramContext)
  {
    return paramContext.getSharedPreferences(ak.aHi(), 0).getString("settings.ringtone", SettingsRingtoneUI.jNT);
  }

  // ERROR //
  public final void cp(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/tencent/mm/booter/notification/a/i:context	Landroid/content/Context;
    //   6: ifnonnull +10 -> 16
    //   9: aload_0
    //   10: invokestatic 42	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   13: putfield 44	com/tencent/mm/booter/notification/a/i:context	Landroid/content/Context;
    //   16: aload_0
    //   17: getfield 44	com/tencent/mm/booter/notification/a/i:context	Landroid/content/Context;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull +6 -> 28
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_1
    //   29: invokestatic 95	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   32: ifeq +291 -> 323
    //   35: iconst_2
    //   36: invokestatic 101	android/media/RingtoneManager:getDefaultUri	(I)Landroid/net/Uri;
    //   39: astore 18
    //   41: aload 18
    //   43: astore 5
    //   45: aload_0
    //   46: getfield 36	com/tencent/mm/booter/notification/a/i:djn	Lcom/tencent/mm/sdk/platformtools/cm;
    //   49: ldc 102
    //   51: invokevirtual 108	com/tencent/mm/sdk/platformtools/cm:removeMessages	(I)V
    //   54: aload_0
    //   55: getfield 36	com/tencent/mm/booter/notification/a/i:djn	Lcom/tencent/mm/sdk/platformtools/cm;
    //   58: ldc 102
    //   60: ldc2_w 109
    //   63: invokevirtual 114	com/tencent/mm/sdk/platformtools/cm:sendEmptyMessageDelayed	(IJ)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 21	com/tencent/mm/booter/notification/a/i:djm	Z
    //   71: ifeq +39 -> 110
    //   74: aload_0
    //   75: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   78: ifnull +32 -> 110
    //   81: aload_0
    //   82: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   85: invokevirtual 120	android/media/MediaPlayer:isPlaying	()Z
    //   88: ifeq +22 -> 110
    //   91: aload_0
    //   92: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   95: invokevirtual 123	android/media/MediaPlayer:stop	()V
    //   98: aload_0
    //   99: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   102: invokevirtual 126	android/media/MediaPlayer:release	()V
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield 21	com/tencent/mm/booter/notification/a/i:djm	Z
    //   110: aload_0
    //   111: new 116	android/media/MediaPlayer
    //   114: dup
    //   115: invokespecial 127	android/media/MediaPlayer:<init>	()V
    //   118: putfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   121: aload_0
    //   122: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   125: aload_0
    //   126: getfield 44	com/tencent/mm/booter/notification/a/i:context	Landroid/content/Context;
    //   129: aload 5
    //   131: invokevirtual 131	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   134: aload_0
    //   135: getfield 44	com/tencent/mm/booter/notification/a/i:context	Landroid/content/Context;
    //   138: ldc 133
    //   140: invokevirtual 137	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   143: checkcast 139	android/media/AudioManager
    //   146: astore 12
    //   148: aload 12
    //   150: iconst_5
    //   151: invokevirtual 143	android/media/AudioManager:getStreamVolume	(I)I
    //   154: ifeq -129 -> 25
    //   157: aload 12
    //   159: invokevirtual 146	android/media/AudioManager:isWiredHeadsetOn	()Z
    //   162: ifeq +174 -> 336
    //   165: aload 12
    //   167: bipush 8
    //   169: invokevirtual 143	android/media/AudioManager:getStreamVolume	(I)I
    //   172: istore 14
    //   174: aload 12
    //   176: bipush 8
    //   178: invokevirtual 149	android/media/AudioManager:getStreamMaxVolume	(I)I
    //   181: istore 15
    //   183: aload 12
    //   185: iconst_5
    //   186: invokevirtual 143	android/media/AudioManager:getStreamVolume	(I)I
    //   189: istore 16
    //   191: iload 16
    //   193: iload 15
    //   195: if_icmple +280 -> 475
    //   198: aload 12
    //   200: bipush 8
    //   202: iload 15
    //   204: iconst_0
    //   205: invokevirtual 153	android/media/AudioManager:setStreamVolume	(III)V
    //   208: aload_0
    //   209: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   212: bipush 8
    //   214: invokevirtual 156	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   217: aload_0
    //   218: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   221: iconst_1
    //   222: invokevirtual 160	android/media/MediaPlayer:setLooping	(Z)V
    //   225: aload_0
    //   226: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   229: invokevirtual 163	android/media/MediaPlayer:prepare	()V
    //   232: aload_0
    //   233: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   236: iconst_0
    //   237: invokevirtual 160	android/media/MediaPlayer:setLooping	(Z)V
    //   240: aload_0
    //   241: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   244: invokevirtual 166	android/media/MediaPlayer:start	()V
    //   247: aload_0
    //   248: iconst_1
    //   249: putfield 21	com/tencent/mm/booter/notification/a/i:djm	Z
    //   252: aload 12
    //   254: bipush 8
    //   256: iload 14
    //   258: iconst_0
    //   259: invokevirtual 153	android/media/AudioManager:setStreamVolume	(III)V
    //   262: iconst_3
    //   263: anewarray 4	java/lang/Object
    //   266: astore 17
    //   268: aload 17
    //   270: iconst_0
    //   271: iload 14
    //   273: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   276: aastore
    //   277: aload 17
    //   279: iconst_1
    //   280: iload 15
    //   282: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   285: aastore
    //   286: aload 17
    //   288: iconst_2
    //   289: aload_1
    //   290: aastore
    //   291: ldc 174
    //   293: ldc 176
    //   295: aload 17
    //   297: invokestatic 182	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: goto -275 -> 25
    //   303: astore 10
    //   305: ldc 174
    //   307: aload 10
    //   309: invokevirtual 185	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   312: invokestatic 188	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: goto -290 -> 25
    //   318: astore_2
    //   319: aload_0
    //   320: monitorexit
    //   321: aload_2
    //   322: athrow
    //   323: aload_1
    //   324: invokestatic 194	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   327: astore 4
    //   329: aload 4
    //   331: astore 5
    //   333: goto -288 -> 45
    //   336: iconst_2
    //   337: anewarray 4	java/lang/Object
    //   340: astore 13
    //   342: aload 13
    //   344: iconst_0
    //   345: aload 12
    //   347: iconst_5
    //   348: invokevirtual 143	android/media/AudioManager:getStreamVolume	(I)I
    //   351: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: aastore
    //   355: aload 13
    //   357: iconst_1
    //   358: aload_1
    //   359: aastore
    //   360: ldc 174
    //   362: ldc 196
    //   364: aload 13
    //   366: invokestatic 182	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: aload_0
    //   370: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   373: iconst_5
    //   374: invokevirtual 156	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   377: aload_0
    //   378: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   381: iconst_1
    //   382: invokevirtual 160	android/media/MediaPlayer:setLooping	(Z)V
    //   385: aload_0
    //   386: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   389: invokevirtual 163	android/media/MediaPlayer:prepare	()V
    //   392: aload_0
    //   393: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   396: iconst_0
    //   397: invokevirtual 160	android/media/MediaPlayer:setLooping	(Z)V
    //   400: aload_0
    //   401: getfield 23	com/tencent/mm/booter/notification/a/i:tA	Landroid/media/MediaPlayer;
    //   404: invokevirtual 166	android/media/MediaPlayer:start	()V
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield 21	com/tencent/mm/booter/notification/a/i:djm	Z
    //   412: goto -387 -> 25
    //   415: astore 9
    //   417: ldc 174
    //   419: aload 9
    //   421: invokevirtual 197	java/lang/SecurityException:getMessage	()Ljava/lang/String;
    //   424: invokestatic 188	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: goto -402 -> 25
    //   430: astore 8
    //   432: ldc 174
    //   434: aload 8
    //   436: invokevirtual 198	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   439: invokestatic 188	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   442: goto -417 -> 25
    //   445: astore 7
    //   447: ldc 174
    //   449: aload 7
    //   451: invokevirtual 199	java/io/IOException:getMessage	()Ljava/lang/String;
    //   454: invokestatic 188	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   457: goto -432 -> 25
    //   460: astore 6
    //   462: ldc 174
    //   464: aload 6
    //   466: invokevirtual 200	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   469: invokestatic 188	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   472: goto -447 -> 25
    //   475: iload 16
    //   477: istore 15
    //   479: goto -281 -> 198
    //
    // Exception table:
    //   from	to	target	type
    //   45	110	303	java/lang/IllegalArgumentException
    //   110	191	303	java/lang/IllegalArgumentException
    //   198	300	303	java/lang/IllegalArgumentException
    //   336	412	303	java/lang/IllegalArgumentException
    //   2	16	318	finally
    //   16	21	318	finally
    //   28	41	318	finally
    //   45	110	318	finally
    //   110	191	318	finally
    //   198	300	318	finally
    //   305	315	318	finally
    //   323	329	318	finally
    //   336	412	318	finally
    //   417	427	318	finally
    //   432	442	318	finally
    //   447	457	318	finally
    //   462	472	318	finally
    //   45	110	415	java/lang/SecurityException
    //   110	191	415	java/lang/SecurityException
    //   198	300	415	java/lang/SecurityException
    //   336	412	415	java/lang/SecurityException
    //   45	110	430	java/lang/IllegalStateException
    //   110	191	430	java/lang/IllegalStateException
    //   198	300	430	java/lang/IllegalStateException
    //   336	412	430	java/lang/IllegalStateException
    //   45	110	445	java/io/IOException
    //   110	191	445	java/io/IOException
    //   198	300	445	java/io/IOException
    //   336	412	445	java/io/IOException
    //   45	110	460	java/lang/Exception
    //   110	191	460	java/lang/Exception
    //   198	300	460	java/lang/Exception
    //   336	412	460	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.i
 * JD-Core Version:    0.6.2
 */