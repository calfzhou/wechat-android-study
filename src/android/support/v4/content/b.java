package android.support.v4.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

final class b
  implements a
{
  private final String dd;
  private final HashMap de = new HashMap();

  public b(String paramString)
  {
    this.dd = paramString;
  }

  public final File a(Uri paramUri)
  {
    String str1 = paramUri.getEncodedPath();
    int i = str1.indexOf('/', 1);
    String str2 = Uri.decode(str1.substring(1, i));
    String str3 = Uri.decode(str1.substring(i + 1));
    File localFile1 = (File)this.de.get(str2);
    if (localFile1 == null)
      throw new IllegalArgumentException("Unable to find configured root for " + paramUri);
    File localFile2 = new File(localFile1, str3);
    File localFile3;
    try
    {
      localFile3 = localFile2.getCanonicalFile();
      if (!localFile3.getPath().startsWith(localFile1.getPath()))
        throw new SecurityException("Resolved path jumped beyond configured root");
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Failed to resolve canonical path for " + localFile2);
    }
    return localFile3;
  }

  public final void a(String paramString, File paramFile)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Name must not be empty");
    try
    {
      File localFile = paramFile.getCanonicalFile();
      this.de.put(paramString, localFile);
      return;
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Failed to resolve canonical path for " + paramFile, localIOException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.b
 * JD-Core Version:    0.6.2
 */