import { AppPage } from './app.po';

describe('Projeto app', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('mensagem de boas vindas', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('Bem vindo ecommerce!');
  });
});
