package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;
import junit.framework.Assert;

public final class ar
  implements m
{
  private Context context;
  private cr dWq;
  private EditText fGo;
  private LinkedList fLC;
  private View fMO;
  private TextView fMQ;
  private aa fav = null;
  private String hAF;
  private ay hBV;
  private LinkedList hBW;
  private boolean hBX = true;

  public ar(Context paramContext, ay paramay)
  {
    this.context = paramContext;
    this.hBV = paramay;
  }

  private void onStart()
  {
    bg.qX().a(30, this);
  }

  private void onStop()
  {
    bg.qX().b(30, this);
    if (this.fav != null)
    {
      this.fav.dismiss();
      this.fav = null;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 30)
    {
      z.w("!44@/B4Tb64lLpLVd6spdHyDjUdOUXrNyAnPpMhB/tzZ/pc=", "not expected scene,  type = " + paramx.getType());
      return;
    }
    z.d("!44@/B4Tb64lLpLVd6spdHyDjUdOUXrNyAnPpMhB/tzZ/pc=", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (this.dWq != null)
    {
      this.dWq.dismiss();
      this.dWq = null;
    }
    onStop();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.hBX)
        e.aw(this.context, this.context.getString(n.cep));
      this.hBV.aF(true);
      return;
    }
    String str;
    if ((paramInt1 == 4) && (paramInt2 == -34))
      str = this.context.getString(n.bJR);
    while (true)
    {
      if (this.hBX)
        Toast.makeText(this.context, str, 1).show();
      this.hBV.aF(false);
      return;
      if ((paramInt1 == 4) && (paramInt2 == -94))
        str = this.context.getString(n.bJS);
      else
        str = this.context.getString(n.ceo);
    }
  }

  public final void b(LinkedList paramLinkedList1, LinkedList paramLinkedList2)
  {
    boolean bool1;
    boolean bool2;
    label23: Object[] arrayOfObject;
    boolean bool3;
    if (paramLinkedList1.size() > 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramLinkedList2.size() <= 0)
        break label315;
      bool2 = true;
      Assert.assertTrue(bool2);
      onStart();
      this.hBW = paramLinkedList1;
      this.fLC = paramLinkedList2;
      this.fMO = View.inflate(this.context, k.bmO, null);
      arrayOfObject = new Object[3];
      if (this.hAF != null)
        break label321;
      bool3 = true;
      label73: arrayOfObject[0] = Boolean.valueOf(bool3);
      if (this.hAF != null)
        break label327;
    }
    label315: label321: label327: for (int i = 0; ; i = this.hAF.length())
    {
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = this.hAF;
      z.i("!44@/B4Tb64lLpLVd6spdHyDjUdOUXrNyAnPpMhB/tzZ/pc=", "verifyTip is null: %b, length : %d, value : [%s]", arrayOfObject);
      if (!ch.jb(this.hAF))
        ((TextView)this.fMO.findViewById(i.aOv)).setText(this.hAF);
      this.fGo = ((EditText)this.fMO.findViewById(i.aOu));
      this.fMQ = ((TextView)this.fMO.findViewById(i.baa));
      this.fMQ.setVisibility(0);
      this.fGo.setText(null);
      this.fMQ.setText("50");
      this.fGo.setFilters(com.tencent.mm.pluginsdk.ui.tools.av.hLZ);
      this.fGo.addTextChangedListener(new as(this));
      at localat = new at(this);
      av localav = new av(this);
      this.fav = e.a(this.context, this.context.getString(n.cer), this.fMO, localat, localav);
      if (this.fav == null)
        onStop();
      this.fGo.post(new aw(this));
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label23;
      bool3 = false;
      break label73;
    }
  }

  public final void c(LinkedList paramLinkedList1, LinkedList paramLinkedList2)
  {
    this.hBX = false;
    onStart();
    bg.qX().d(new p(2, paramLinkedList1, paramLinkedList2, "", ""));
  }

  public final void vu(String paramString)
  {
    this.hAF = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ar
 * JD-Core Version:    0.6.2
 */