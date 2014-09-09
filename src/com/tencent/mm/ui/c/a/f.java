package com.tencent.mm.ui.c.a;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.b;

final class f
  implements g
{
  f(e parame)
  {
  }

  public final void a(Bundle paramBundle)
  {
    b.bdr();
    b.sync();
    this.jHG.CW(paramBundle.getString("access_token"));
    this.jHG.CX(paramBundle.getString("expires_in"));
    if (this.jHG.aYz())
    {
      z.d("Facebook-authorize", "Login Success! access_token=" + this.jHG.aYA() + " expires=" + this.jHG.aYB());
      e.a(this.jHG).a(paramBundle);
      return;
    }
    e.a(this.jHG).a(new h("Failed to receive access token."));
  }

  public final void a(d paramd)
  {
    z.d("Facebook-authorize", "Login failed: " + paramd);
    e.a(this.jHG).a(paramd);
  }

  public final void a(h paramh)
  {
    z.d("Facebook-authorize", "Login failed: " + paramh);
    e.a(this.jHG).a(paramh);
  }

  public final void onCancel()
  {
    z.d("Facebook-authorize", "Login canceled");
    e.a(this.jHG).onCancel();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.f
 * JD-Core Version:    0.6.2
 */