package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import com.tencent.mm.k;

public class r
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, af
{
  private o hM;
  private AlertDialog lt;
  m lu;
  private af lv;

  public r(o paramo)
  {
    this.hM = paramo;
  }

  public final void a(o paramo, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramo == this.hM))
      dismiss();
    if (this.lv != null)
      this.lv.a(paramo, paramBoolean);
  }

  public final boolean b(o paramo)
  {
    if (this.lv != null)
      return this.lv.b(paramo);
    return false;
  }

  public final void bW()
  {
    o localo = this.hM;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localo.getContext());
    this.lu = new m(k.bat, com.tencent.mm.o.cuG);
    this.lu.a(this);
    this.hM.a(this.lu);
    localBuilder.setAdapter(this.lu.getAdapter(), this);
    View localView = localo.ll;
    if (localView != null)
      localBuilder.setCustomTitle(localView);
    while (true)
    {
      localBuilder.setOnKeyListener(this);
      this.lt = localBuilder.create();
      this.lt.setOnDismissListener(this);
      WindowManager.LayoutParams localLayoutParams = this.lt.getWindow().getAttributes();
      localLayoutParams.type = 1003;
      localLayoutParams.flags = (0x20000 | localLayoutParams.flags);
      this.lt.show();
      return;
      localBuilder.setIcon(localo.lk).setTitle(localo.lj);
    }
  }

  public final void dismiss()
  {
    if (this.lt != null)
      this.lt.dismiss();
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.hM.c((s)this.lu.getAdapter().getItem(paramInt), 0);
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.lu.a(this.hM, true);
  }

  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4))
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        Window localWindow2 = this.lt.getWindow();
        if (localWindow2 != null)
        {
          View localView2 = localWindow2.getDecorView();
          if (localView2 != null)
          {
            KeyEvent.DispatcherState localDispatcherState2 = localView2.getKeyDispatcherState();
            if (localDispatcherState2 != null)
            {
              localDispatcherState2.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Window localWindow1 = this.lt.getWindow();
        if (localWindow1 != null)
        {
          View localView1 = localWindow1.getDecorView();
          if (localView1 != null)
          {
            KeyEvent.DispatcherState localDispatcherState1 = localView1.getKeyDispatcherState();
            if ((localDispatcherState1 != null) && (localDispatcherState1.isTracking(paramKeyEvent)))
            {
              this.hM.l(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    return this.hM.performShortcut(paramInt, paramKeyEvent, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.r
 * JD-Core Version:    0.6.2
 */