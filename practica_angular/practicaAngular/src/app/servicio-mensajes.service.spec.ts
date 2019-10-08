import { TestBed } from '@angular/core/testing';

import { ServicioMensajesService } from './servicio-mensajes.service';

describe('ServicioMensajesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicioMensajesService = TestBed.get(ServicioMensajesService);
    expect(service).toBeTruthy();
  });
});
