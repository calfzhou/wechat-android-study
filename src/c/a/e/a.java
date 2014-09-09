package c.a.e;

import c.a.c.e;
import c.a.c.f;
import c.a.d.i;
import c.a.d.j;
import c.a.d.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements b
{
  private c.a.a.a.b kmA;
  private c.a.d.a kmz;

  public a(c.a.a.a.b paramb, c.a.d.a parama)
  {
    this.kmA = paramb;
    this.kmz = parama;
  }

  private void a(c.a.d.c paramc, i parami)
  {
    paramc.bU("oauth_timestamp", new c.a.f.d().bfT());
    paramc.bU("oauth_nonce", new c.a.f.d().bfU());
    paramc.bU("oauth_consumer_key", this.kmz.bfx());
    paramc.bU("oauth_signature_method", new c.a.f.a().bfS());
    paramc.bU("oauth_version", "1.0");
    if (this.kmz.bfC())
      paramc.bU("scope", this.kmz.bfB());
    this.kmz.q("generating signature...");
    String str1 = new c.a.c.c().a(paramc);
    String str2 = new c.a.f.a().B(str1, this.kmz.bfy(), parami.bfP());
    this.kmz.q("base string is: " + str1);
    this.kmz.q("signature is: " + str2);
    paramc.bU("oauth_signature", str2);
    this.kmz.q("appended additional OAuth parameters: " + c.a.g.b.x(paramc.bfD()));
  }

  private void b(c.a.d.c paramc)
  {
    switch (bfR()[this.kmz.bfA().ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.kmz.q("using Http Header signature");
      paramc.addHeader("Authorization", new e().a(paramc));
      return;
      this.kmz.q("using Querystring signature");
      Iterator localIterator = paramc.bfD().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramc.bV((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }

  public final i a(i parami, k paramk)
  {
    this.kmz.q("obtaining access token from " + this.kmA.bfw());
    c.a.d.c localc = new c.a.d.c(j.kmr, this.kmA.bfw());
    localc.bU("oauth_token", parami.atX());
    localc.bU("oauth_verifier", paramk.getValue());
    this.kmz.q("setting token to: " + parami + " and verifier to: " + paramk);
    a(localc, parami);
    b(localc);
    c.a.d.g localg = localc.bfI();
    return new c.a.c.g().DW(localg.getBody());
  }

  public final void a(i parami, c.a.d.c paramc)
  {
    this.kmz.q("signing request: " + paramc.bfG());
    if (!parami.isEmpty())
      paramc.bU("oauth_token", parami.atX());
    this.kmz.q("setting token to: " + parami);
    a(paramc, parami);
    b(paramc);
  }

  public final i bfQ()
  {
    this.kmz.q("obtaining request token from " + this.kmA.bfv());
    c.a.d.c localc = new c.a.d.c(j.kmr, this.kmA.bfv());
    this.kmz.q("setting oauth_callback to " + this.kmz.bfz());
    localc.bU("oauth_callback", this.kmz.bfz());
    a(localc, c.a.d.b.klX);
    b(localc);
    this.kmz.q("sending request...");
    c.a.d.g localg = localc.bfI();
    String str = localg.getBody();
    this.kmz.q("response status code: " + localg.GC());
    this.kmz.q("response body: " + str);
    return new c.a.c.g().DW(str);
  }

  public final String c(i parami)
  {
    return this.kmA.c(parami);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.e.a
 * JD-Core Version:    0.6.2
 */