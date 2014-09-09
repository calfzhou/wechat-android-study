package com.tencent.mm.modelfriend;

import android.content.Intent;
import com.tencent.mm.an.a;
import com.tencent.mm.c.a.f;
import com.tencent.mm.c.a.ka;
import com.tencent.mm.c.a.kb;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.z;

final class bl extends com.tencent.mm.sdk.c.g
{
  bl(az paramaz)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    Intent localIntent;
    String str;
    if (parame.getId().equals("SetLocalQQMobile"))
    {
      ka localka = (ka)parame;
      localIntent = localka.cNT.intent;
      str = localka.cNT.username;
      if ((localIntent != null) && (str != null) && (str.length() != 0))
        break label109;
      z.e("!44@/B4Tb64lLpIaKqQrIg/z8CYpjgS2xvW/lI1TfeVY1dY=", "setLocalQQMobile fail, intent = " + localIntent + ", username = " + str);
    }
    while (true)
    {
      if (parame.getId().equals("AddFMessageCardClick"))
        a.nr(((f)parame).cHk.cCn);
      return false;
      label109: ax localax = az.xe().gH(str);
      if (localax != null)
      {
        localIntent.putExtra("Contact_Uin", localax.wP());
        localIntent.putExtra("Contact_QQNick", localax.getDisplayName());
      }
      i locali = az.wZ().gl(str);
      if (locali != null)
        localIntent.putExtra("Contact_Mobile_MD5", locali.vu());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.bl
 * JD-Core Version:    0.6.2
 */