import { TestBed } from '@angular/core/testing';

import { ServicioUsuariosService } from './servicio-usuarios.service';

describe('ServicioUsuariosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicioUsuariosService = TestBed.get(ServicioUsuariosService);
    expect(service).toBeTruthy();
  });
});
