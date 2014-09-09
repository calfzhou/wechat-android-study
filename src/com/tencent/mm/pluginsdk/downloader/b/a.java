package com.tencent.mm.pluginsdk.downloader.b;

import java.io.InputStream;
import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public final class a
  implements b
{
  final HttpClient htL = new DefaultHttpClient();

  public final InputStream a(URL paramURL)
  {
    return this.htL.execute(new HttpGet(paramURL.toURI())).getEntity().getContent();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.b.a
 * JD-Core Version:    0.6.2
 */