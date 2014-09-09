package com.tencent.mm.ui.tools.a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.InputStream;

public final class k extends j
{
  final Context context;

  k(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramContext, paramn, parame, parama);
    this.context = paramContext;
  }

  // ERROR //
  private Bitmap Dq(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 12	com/tencent/mm/ui/tools/a/k:context	Landroid/content/Context;
    //   6: invokevirtual 20	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   9: astore_3
    //   10: aload_0
    //   11: getfield 24	com/tencent/mm/ui/tools/a/k:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   14: invokevirtual 30	com/tencent/mm/ui/tools/a/ab:bby	()Z
    //   17: ifeq +99 -> 116
    //   20: new 32	android/graphics/BitmapFactory$Options
    //   23: dup
    //   24: invokespecial 35	android/graphics/BitmapFactory$Options:<init>	()V
    //   27: astore 4
    //   29: aload 4
    //   31: iconst_1
    //   32: putfield 39	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual 45	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   40: astore_2
    //   41: aload_2
    //   42: aconst_null
    //   43: aload 4
    //   45: invokestatic 51	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   48: pop
    //   49: aload_2
    //   50: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   53: aload_0
    //   54: getfield 24	com/tencent/mm/ui/tools/a/k:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   57: getfield 61	com/tencent/mm/ui/tools/a/ab:fkq	I
    //   60: aload_0
    //   61: getfield 24	com/tencent/mm/ui/tools/a/k:jWq	Lcom/tencent/mm/ui/tools/a/ab;
    //   64: getfield 64	com/tencent/mm/ui/tools/a/ab:eSi	I
    //   67: aload 4
    //   69: invokestatic 68	com/tencent/mm/ui/tools/a/k:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   72: aload_3
    //   73: aload_1
    //   74: invokevirtual 45	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   77: astore 7
    //   79: aload 7
    //   81: aconst_null
    //   82: aload 4
    //   84: invokestatic 51	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   87: astore 9
    //   89: aload 7
    //   91: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   94: aload 9
    //   96: areturn
    //   97: astore 5
    //   99: aload_2
    //   100: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   103: aload 5
    //   105: athrow
    //   106: astore 8
    //   108: aload 7
    //   110: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   113: aload 8
    //   115: athrow
    //   116: aconst_null
    //   117: astore 4
    //   119: goto -47 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   35	49	97	finally
    //   79	89	106	finally
  }

  private Bitmap a(InputStream paramInputStream, ab paramab)
  {
    if (paramInputStream == null)
      return null;
    BitmapFactory.Options localOptions;
    InputStream localInputStream;
    if (paramab.bby())
    {
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      localInputStream = getInputStream();
    }
    while (true)
    {
      try
      {
        BitmapFactory.decodeStream(localInputStream, null, localOptions);
        af.h(localInputStream);
        a(paramab.fkq, paramab.eSi, localOptions);
        return BitmapFactory.decodeStream(paramInputStream, null, localOptions);
      }
      finally
      {
        af.h(localInputStream);
      }
      localOptions = null;
    }
  }

  private InputStream getInputStream()
  {
    ContentResolver localContentResolver = this.context.getContentResolver();
    Uri localUri = this.jWq.uri;
    if (localUri.toString().startsWith(ContactsContract.Contacts.CONTENT_LOOKUP_URI.toString()))
    {
      localUri = ContactsContract.Contacts.lookupContact(localContentResolver, localUri);
      if (localUri == null)
        return null;
    }
    if (Build.VERSION.SDK_INT < 14)
      return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, localUri);
    return ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, localUri, true);
  }

  // ERROR //
  final Bitmap a(ab paramab)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 122	com/tencent/mm/ui/tools/a/ab:jXl	Lcom/tencent/mm/ui/tools/a/l;
    //   4: invokevirtual 128	com/tencent/mm/ui/tools/a/l:baH	()Landroid/net/Uri;
    //   7: astore_2
    //   8: new 130	com/tencent/mm/ui/tools/a/ac
    //   11: dup
    //   12: aload_1
    //   13: iconst_0
    //   14: invokespecial 133	com/tencent/mm/ui/tools/a/ac:<init>	(Lcom/tencent/mm/ui/tools/a/ab;B)V
    //   17: aload_2
    //   18: invokevirtual 136	com/tencent/mm/ui/tools/a/ac:h	(Landroid/net/Uri;)Lcom/tencent/mm/ui/tools/a/ac;
    //   21: invokevirtual 140	com/tencent/mm/ui/tools/a/ac:bbC	()Lcom/tencent/mm/ui/tools/a/ab;
    //   24: astore_3
    //   25: aload_2
    //   26: invokevirtual 143	android/net/Uri:getScheme	()Ljava/lang/String;
    //   29: astore 4
    //   31: ldc 145
    //   33: aload 4
    //   35: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: ifeq +83 -> 121
    //   41: getstatic 152	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   44: invokevirtual 155	android/net/Uri:getHost	()Ljava/lang/String;
    //   47: aload_2
    //   48: invokevirtual 155	android/net/Uri:getHost	()Ljava/lang/String;
    //   51: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   54: ifeq +61 -> 115
    //   57: aload_2
    //   58: invokevirtual 159	android/net/Uri:getPathSegments	()Ljava/util/List;
    //   61: ldc 161
    //   63: invokeinterface 166 2 0
    //   68: ifne +47 -> 115
    //   71: aload_0
    //   72: invokespecial 73	com/tencent/mm/ui/tools/a/k:getInputStream	()Ljava/io/InputStream;
    //   75: astore 13
    //   77: aload 13
    //   79: astore 11
    //   81: aload_0
    //   82: aload 11
    //   84: aload_1
    //   85: invokespecial 168	com/tencent/mm/ui/tools/a/k:a	(Ljava/io/InputStream;Lcom/tencent/mm/ui/tools/a/ab;)Landroid/graphics/Bitmap;
    //   88: astore 14
    //   90: aload 11
    //   92: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   95: aload 14
    //   97: areturn
    //   98: astore 10
    //   100: aconst_null
    //   101: astore 11
    //   103: aload 10
    //   105: astore 12
    //   107: aload 11
    //   109: invokestatic 57	com/tencent/mm/ui/tools/a/af:h	(Ljava/io/InputStream;)V
    //   112: aload 12
    //   114: athrow
    //   115: aload_0
    //   116: aload_3
    //   117: invokespecial 170	com/tencent/mm/ui/tools/a/j:a	(Lcom/tencent/mm/ui/tools/a/ab;)Landroid/graphics/Bitmap;
    //   120: areturn
    //   121: ldc 172
    //   123: aload 4
    //   125: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   128: ifeq +50 -> 178
    //   131: ldc 174
    //   133: aload_2
    //   134: invokevirtual 159	android/net/Uri:getPathSegments	()Ljava/util/List;
    //   137: iconst_0
    //   138: invokeinterface 178 2 0
    //   143: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifeq +18 -> 164
    //   149: aload_0
    //   150: aload_2
    //   151: invokevirtual 90	android/net/Uri:toString	()Ljava/lang/String;
    //   154: getstatic 181	com/tencent/mm/ui/tools/a/k:jWz	I
    //   157: invokevirtual 185	java/lang/String:substring	(I)Ljava/lang/String;
    //   160: invokespecial 187	com/tencent/mm/ui/tools/a/k:Dq	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   163: areturn
    //   164: aload_0
    //   165: aload_2
    //   166: invokestatic 193	com/tencent/mm/ui/tools/a/q:g	(Landroid/net/Uri;)I
    //   169: putfield 196	com/tencent/mm/ui/tools/a/d:jWG	I
    //   172: aload_0
    //   173: aload_3
    //   174: invokespecial 170	com/tencent/mm/ui/tools/a/j:a	(Lcom/tencent/mm/ui/tools/a/ab;)Landroid/graphics/Bitmap;
    //   177: areturn
    //   178: ldc 198
    //   180: aload 4
    //   182: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifeq +80 -> 265
    //   188: aload_0
    //   189: getfield 12	com/tencent/mm/ui/tools/a/k:context	Landroid/content/Context;
    //   192: invokevirtual 202	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   195: astore 5
    //   197: aload_3
    //   198: getfield 205	com/tencent/mm/ui/tools/a/ab:resourceId	I
    //   201: istore 6
    //   203: aload_3
    //   204: invokevirtual 30	com/tencent/mm/ui/tools/a/ab:bby	()Z
    //   207: istore 7
    //   209: aconst_null
    //   210: astore 8
    //   212: iload 7
    //   214: ifeq +41 -> 255
    //   217: new 32	android/graphics/BitmapFactory$Options
    //   220: dup
    //   221: invokespecial 35	android/graphics/BitmapFactory$Options:<init>	()V
    //   224: astore 8
    //   226: aload 8
    //   228: iconst_1
    //   229: putfield 39	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   232: aload 5
    //   234: iload 6
    //   236: aload 8
    //   238: invokestatic 209	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   241: pop
    //   242: aload_3
    //   243: getfield 61	com/tencent/mm/ui/tools/a/ab:fkq	I
    //   246: aload_3
    //   247: getfield 64	com/tencent/mm/ui/tools/a/ab:eSi	I
    //   250: aload 8
    //   252: invokestatic 68	com/tencent/mm/ui/tools/a/k:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   255: aload 5
    //   257: iload 6
    //   259: aload 8
    //   261: invokestatic 209	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   264: areturn
    //   265: new 211	java/lang/UnsupportedOperationException
    //   268: dup
    //   269: ldc 213
    //   271: invokespecial 216	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   274: athrow
    //   275: astore 12
    //   277: goto -170 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   71	77	98	finally
    //   81	90	275	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.k
 * JD-Core Version:    0.6.2
 */