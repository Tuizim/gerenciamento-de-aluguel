import { Component, inject } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzMenuModule, NzMenuThemeType } from 'ng-zorro-antd/menu';
import { NzTooltipModule } from 'ng-zorro-antd/tooltip';
import { AuthService } from '../../service/auth-service';

@Component({
  selector: 'app-root',
  imports: [RouterLink, RouterOutlet, NzIconModule, NzLayoutModule, NzMenuModule,NzTooltipModule],
  templateUrl: './main.html',
  styleUrl: './main.less'
})
export class Main {
  isCollapsed = false;
  theme:NzMenuThemeType = 'light'

  private authService = inject(AuthService)
  public logout(){
    this.authService.logout();
  }
}
