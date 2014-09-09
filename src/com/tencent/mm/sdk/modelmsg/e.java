package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.d.a;

public final class e extends a
{
  public String dAo;
  public String dCE;
  public String messageAction;
  public String messageExt;

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxobject_message_action", this.messageAction);
    paramBundle.putString("_wxobject_message_ext", this.messageExt);
    paramBundle.putString("_wxapi_launch_req_lang", this.dAo);
    paramBundle.putString("_wxapi_launch_req_country", this.dCE);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.messageAction = paramBundle.getString("_wxobject_message_action");
    this.messageExt = paramBundle.getString("_wxobject_message_ext");
    this.dAo = paramBundle.getString("_wxapi_launch_req_lang");
    this.dCE = paramBundle.getString("_wxapi_launch_req_country");
  }

  public final int getType()
  {
    return 6;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.e
 * JD-Core Version:    0.6.2
 */