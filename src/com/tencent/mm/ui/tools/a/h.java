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

final class h extends d
{
  final Context context;

  h(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramn, parame, parama);
    this.context = paramContext;
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

  final Bitmap a(ab paramab)
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = getInputStream();
      Bitmap localBitmap = a(localInputStream, paramab);
      return localBitmap;
    }
    finally
    {
      af.h(localInputStream);
    }
  }

  final s bbr()
  {
    return s.jWU;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.h
 * JD-Core Version:    0.6.2
 */