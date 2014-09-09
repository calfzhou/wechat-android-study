package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.tools.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.voicesearch.VoiceSearchResultUI;

final class au
  implements bg
{
  au(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void DR()
  {
  }

  public final void DS()
  {
  }

  public final void Jf()
  {
    z.v("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onVoiceSearchStart");
    this.jyq.XF();
  }

  public final void Jg()
  {
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    z.v("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onVoiceReturn");
    if (paramBoolean)
    {
      Intent localIntent1 = new Intent(this.jyq.aPI(), VoiceSearchResultUI.class);
      localIntent1.putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString);
      localIntent1.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
      localIntent1.putExtra("VoiceSearchResultUI_ShowType", paramInt);
      this.jyq.aPI().startActivity(localIntent1);
      return;
    }
    Intent localIntent2 = new Intent(this.jyq.aPI(), VoiceSearchResultUI.class);
    localIntent2.putExtra("VoiceSearchResultUI_Resultlist", new String[0]);
    localIntent2.putExtra("VoiceSearchResultUI_Error", this.jyq.aPI().getString(n.bKk));
    localIntent2.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
    localIntent2.putExtra("VoiceSearchResultUI_ShowType", paramInt);
    this.jyq.aPI().startActivity(localIntent2);
  }

  public final boolean jG(String paramString)
  {
    return false;
  }

  public final void jH(String paramString)
  {
    z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onSearchBarChange %s", new Object[] { paramString });
    String str = ap.iV(paramString);
    ChatroomContactUI.a(this.jyq, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.au
 * JD-Core Version:    0.6.2
 */