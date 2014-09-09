package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;

final class j
  implements h
{
  j(UIEntryStub paramUIEntryStub, Bundle paramBundle, com.tencent.mm.sdk.modelmsg.j paramj)
  {
  }

  public final void aq(boolean paramBoolean)
  {
    boolean bool = this.ehK.isFinishing();
    z.d("!32@/B4Tb64lLpLQqVsArFw5OxJ/b8BKWyrY", "onCheckEnd, isPass = " + paramBoolean + ", isFinishing = " + bool);
    if ((paramBoolean) && (!bool))
    {
      Intent localIntent = new Intent(this.ehK, SendAppMessageWrapperUI.class);
      localIntent.putExtras(this.dVd);
      localIntent.putExtra("Select_Conv_User", "weixinfile");
      localIntent.putExtra("SendAppMessageWrapper_Scene", this.ehL.cCn);
      this.ehK.startActivity(localIntent);
    }
    this.ehK.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.j
 * JD-Core Version:    0.6.2
 */